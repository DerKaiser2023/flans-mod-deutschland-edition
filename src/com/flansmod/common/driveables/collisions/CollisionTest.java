// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.collisions;

import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.vector.Vector3f;

public class CollisionTest
{
    public Vector3f eRad;
    public Vector3f R3Velocity;
    public Vector3f R3Position;
    public Vector3f velocity;
    public Vector3f normalisedVelocity;
    public Vector3f basePoint;
    public boolean didCollide;
    public boolean evil;
    public double nearestDistance;
    public Vector3f intersectionPoint;
    public int collisionRecursiveDepth;
    public boolean isOnTop;
    public Vector3f collisionPlaneNormal;
    public EnumDriveablePart part;
    
    public CollisionTest(final Vector3f ellipsoid, final Vector3f origin, final Vector3f motion) {
        this.didCollide = false;
        this.evil = false;
        this.isOnTop = false;
        this.eRad = ellipsoid;
        this.R3Velocity = motion;
        this.R3Position = origin;
        this.velocity = this.ConvertR3ToESpace(motion);
        this.normalisedVelocity = this.velocity.normalise(this.normalisedVelocity);
        this.basePoint = origin;
    }
    
    public void checkTriangle(final CollisionTest test, final Vector3f p1, final Vector3f p2, final Vector3f p3) {
        final CollisionPlane trianglePlane = new CollisionPlane(p1, p2, p3);
        if (trianglePlane.isFrontFacingTo(test.normalisedVelocity)) {
            boolean embeddedInPlane = false;
            final double signedDistToTrianglePlane = trianglePlane.signedDistanceTo(test.basePoint);
            final float normalDotVelocity = Vector3f.dot(trianglePlane.normal, test.velocity);
            double t0;
            if (normalDotVelocity == 0.0f) {
                if (Math.abs(signedDistToTrianglePlane) >= 1.0) {
                    return;
                }
                embeddedInPlane = true;
                t0 = 0.0;
                final double t2 = 1.0;
            }
            else {
                t0 = (-1.0 - signedDistToTrianglePlane) / normalDotVelocity;
                double t2 = (1.0 - signedDistToTrianglePlane) / normalDotVelocity;
                if (t0 > t2) {
                    final double temp = t2;
                    t2 = t0;
                    t0 = temp;
                }
                if (t0 > 1.0 || t2 < 0.0) {
                    return;
                }
                if (t0 < 0.0) {
                    t0 = 0.0;
                }
                if (t2 < 0.0) {
                    t2 = 0.0;
                }
                if (t0 > 1.0) {
                    t0 = 1.0;
                }
                if (t2 > 1.0) {
                    t2 = 1.0;
                }
            }
            Vector3f collisionPoint = new Vector3f(0.0f, 0.0f, 0.0f);
            boolean foundCollision = false;
            float t3 = 1.0f;
            if (!embeddedInPlane) {
                final Vector3f baseSubNormal = Vector3f.sub(this.basePoint, trianglePlane.normal, null);
                final Vector3f planeIntersectionPoint = Vector3f.add(baseSubNormal, new Vector3f(t0 * test.velocity.x, t0 * test.velocity.y, t0 * test.velocity.z), null);
                if (this.checkPointInTriangle(planeIntersectionPoint, p1, p2, p3)) {
                    foundCollision = true;
                    t3 = (float)t0;
                    collisionPoint = planeIntersectionPoint;
                }
            }
            if (!foundCollision) {
                final Vector3f velocity = test.velocity;
                final Vector3f base = test.basePoint;
                float a;
                final float velocitySquaredLength = a = velocity.lengthSquared();
                final Vector3f baseSubP1 = Vector3f.sub(base, p1, null);
                float b = 2.0f * Vector3f.dot(velocity, baseSubP1);
                float c = baseSubP1.lengthSquared() - 1.0f;
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    t3 = this.getLowestRoot(a, b, c, t3);
                    foundCollision = true;
                    collisionPoint = p1;
                }
                final Vector3f baseSubP2 = Vector3f.sub(base, p2, null);
                b = 2.0f * Vector3f.dot(velocity, baseSubP2);
                c = baseSubP2.lengthSquared();
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    t3 = this.getLowestRoot(a, b, c, t3);
                    foundCollision = true;
                    collisionPoint = p2;
                }
                final Vector3f baseSubP3 = Vector3f.sub(base, p3, null);
                b = 2.0f * Vector3f.dot(velocity, baseSubP3);
                c = baseSubP3.lengthSquared();
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    t3 = this.getLowestRoot(a, b, c, t3);
                    foundCollision = true;
                    collisionPoint = p3;
                }
                Vector3f edge = Vector3f.sub(p2, p1, null);
                Vector3f baseToVertex = Vector3f.sub(p1, base, null);
                float edgeSquaredLength = edge.lengthSquared();
                float edgeDotVelocity = Vector3f.dot(edge, velocity);
                float edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
                a = edgeSquaredLength * -velocitySquaredLength + edgeDotVelocity * edgeDotVelocity;
                b = edgeSquaredLength * (2.0f * Vector3f.dot(velocity, baseToVertex)) - 2.0f * edgeDotVelocity * edgeDotBaseToVertex;
                c = edgeSquaredLength * (1.0f - baseToVertex.lengthSquared()) + edgeDotBaseToVertex * edgeDotBaseToVertex;
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    final float newT = this.getLowestRoot(a, b, c, t3);
                    final float f = (edgeDotVelocity * newT - edgeDotBaseToVertex) / edgeSquaredLength;
                    if (f >= 0.0 && f <= 1.0) {
                        t3 = newT;
                        foundCollision = true;
                        collisionPoint = Vector3f.add(p1, new Vector3f(f * edge.x, f * edge.y, f * edge.z), null);
                    }
                }
                edge = Vector3f.sub(p3, p2, null);
                baseToVertex = Vector3f.sub(p2, base, null);
                edgeSquaredLength = edge.lengthSquared();
                edgeDotVelocity = Vector3f.dot(edge, velocity);
                edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
                a = edgeSquaredLength * -velocitySquaredLength + edgeDotVelocity * edgeDotVelocity;
                b = edgeSquaredLength * (2.0f * Vector3f.dot(velocity, baseToVertex)) - 2.0f * edgeDotVelocity * edgeDotBaseToVertex;
                c = edgeSquaredLength * (1.0f - baseToVertex.lengthSquared()) + edgeDotBaseToVertex * edgeDotBaseToVertex;
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    final float newT = this.getLowestRoot(a, b, c, t3);
                    final float f = (edgeDotVelocity * newT - edgeDotBaseToVertex) / edgeSquaredLength;
                    if (f >= 0.0 && f <= 1.0) {
                        t3 = newT;
                        foundCollision = true;
                        collisionPoint = Vector3f.add(p2, new Vector3f(f * edge.x, f * edge.y, f * edge.z), null);
                    }
                }
                edge = Vector3f.sub(p1, p3, null);
                baseToVertex = Vector3f.sub(p3, base, null);
                edgeSquaredLength = edge.lengthSquared();
                edgeDotVelocity = Vector3f.dot(edge, velocity);
                edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
                a = edgeSquaredLength * -velocitySquaredLength + edgeDotVelocity * edgeDotVelocity;
                b = edgeSquaredLength * (2.0f * Vector3f.dot(velocity, baseToVertex)) - 2.0f * edgeDotVelocity * edgeDotBaseToVertex;
                c = edgeSquaredLength * (1.0f - baseToVertex.lengthSquared()) + edgeDotBaseToVertex * edgeDotBaseToVertex;
                if (this.getLowestRoot(a, b, c, t3) != 1.2345679E8f) {
                    final float newT = this.getLowestRoot(a, b, c, t3);
                    final float f = (edgeDotVelocity * newT - edgeDotBaseToVertex) / edgeSquaredLength;
                    if (f >= 0.0 && f <= 1.0) {
                        t3 = newT;
                        foundCollision = true;
                        collisionPoint = Vector3f.add(p3, new Vector3f(f * edge.x, f * edge.y, f * edge.z), null);
                    }
                }
            }
            if (foundCollision) {
                final float distToCollision = t3 * test.velocity.length();
                if (!test.didCollide || distToCollision < test.nearestDistance) {
                    test.nearestDistance = distToCollision;
                    test.intersectionPoint = collisionPoint;
                    test.didCollide = true;
                }
            }
        }
    }
    
    public float getLowestRoot(final float a, final float b, final float c, final float maxR) {
        final float determinant = b * b - 4.0f * a * c;
        if (determinant < 0.0f) {
            return 1.2345679E8f;
        }
        final float sqrtD = (float)Math.sqrt(determinant);
        float r1 = (-b - sqrtD) / (2.0f * a);
        float r2 = (-b + sqrtD) / (2.0f * a);
        if (r1 > r2) {
            final float temp = r2;
            r2 = r1;
            r1 = temp;
        }
        if (r1 > 0.0f && r1 < maxR) {
            return r1;
        }
        if (r2 > 0.0f && r2 < maxR) {
            return r2;
        }
        return 1.2345679E8f;
    }
    
    public boolean checkPointInTriangle(final Vector3f point, final Vector3f p1, final Vector3f p2, final Vector3f p3) {
        final Vector3f edge1 = Vector3f.sub(p2, p1, null);
        final Vector3f edge2 = Vector3f.sub(p3, p1, null);
        final float a = Vector3f.dot(edge1, edge1);
        final float b = Vector3f.dot(edge1, edge2);
        final float c = Vector3f.dot(edge2, edge2);
        final float acSUBbb = a * c - b * b;
        final Vector3f vp = new Vector3f(point.x - p1.x, point.y - p1.y, point.z - p1.z);
        final float d = Vector3f.dot(vp, edge1);
        final float e = Vector3f.dot(vp, edge2);
        final float x = d * c - e * b;
        final float y = e * a - d * b;
        final float z = x + y - acSUBbb;
        return z < 0.0f && x >= 0.0f && y >= 0.0f;
    }
    
    public Vector3f ConvertR3ToESpace(final Vector3f r3) {
        return new Vector3f(1.0f / this.eRad.x * r3.x, 1.0f / this.eRad.y * r3.y, 1.0f / this.eRad.z * r3.z);
    }
    
    public Vector3f ConvertESpaceToR3(final Vector3f esp) {
        return new Vector3f(esp.x / (1.0f / this.eRad.x), esp.y / (1.0f / this.eRad.y), esp.z / (1.0f / this.eRad.z));
    }
}
