// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.animation;

import com.flansmod.common.RotatedAxes;
import java.util.Iterator;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;

public class AnimationController
{
    public ArrayList<AnimationPart> parts;
    public int state;
    int animStage;
    ArrayList<AnimationPose> poses;
    AnimationPose pose;
    public int timeSinceSwitch;
    
    public AnimationController() {
        this.parts = new ArrayList<AnimationPart>();
        this.state = 0;
        this.animStage = 1;
        this.poses = new ArrayList<AnimationPose>();
        this.timeSinceSwitch = 0;
    }
    
    public void initAnim() {
        this.addPartToSkeleton(new AnimationPart(0, new Vector3f(11.0, -34.5, 0.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), -1);
        this.addPartToSkeleton(new AnimationPart(1, new Vector3f(6.0, -34.5, 0.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(2, new Vector3f(-25.0, -34.5, 0.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 1);
        this.addPartToSkeleton(new AnimationPart(3, new Vector3f(-9.0, -25.0, -13.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(4, new Vector3f(6.0, -23.0, -21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 3);
        this.addPartToSkeleton(new AnimationPart(5, new Vector3f(34.0, -21.5, -21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 4);
        this.addPartToSkeleton(new AnimationPart(6, new Vector3f(-9.0, -25.0, 13.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(7, new Vector3f(6.0, -23.0, 21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 6);
        this.addPartToSkeleton(new AnimationPart(8, new Vector3f(34.0, -21.5, 21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 7);
        this.addPartToSkeleton(new AnimationPart(9, new Vector3f(6.0f, -33.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(10, new Vector3f(43.0, -38.5, 0.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 9);
        this.addPartToSkeleton(new AnimationPart(11, new Vector3f(60.0, -40.0, -14.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 10);
        this.addPartToSkeleton(new AnimationPart(12, new Vector3f(60.0, -40.0, 14.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 10);
        this.addPartToSkeleton(new AnimationPart(13, new Vector3f(10.0, -36.5, -17.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 9);
        this.addPartToSkeleton(new AnimationPart(14, new Vector3f(10.0, -36.5, 17.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 9);
        this.addPartToSkeleton(new AnimationPart(15, new Vector3f(39.0, -13.0, -21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 5);
        this.addPartToSkeleton(new AnimationPart(16, new Vector3f(119.0, -23.0, -21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 5);
        this.addPartToSkeleton(new AnimationPart(17, new Vector3f(119.0, -23.0, -21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 5);
        this.addPartToSkeleton(new AnimationPart(18, new Vector3f(39.0, -13.0, 21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 8);
        this.addPartToSkeleton(new AnimationPart(19, new Vector3f(119.0, -23.0, 21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 8);
        this.addPartToSkeleton(new AnimationPart(20, new Vector3f(119.0, -23.0, 21.5), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 8);
        this.addPartToSkeleton(new AnimationPart(21, new Vector3f(-17.0f, -33.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 2);
        this.addPartToSkeleton(new AnimationPart(22, new Vector3f(-15.0f, -23.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 21);
        this.addPartToSkeleton(new AnimationPart(23, new Vector3f(17.0f, -31.0f, -7.0f), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(24, new Vector3f(22.0, -20.5, -7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 23);
        this.addPartToSkeleton(new AnimationPart(25, new Vector3f(33.0, -20.5, -7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 24);
        this.addPartToSkeleton(new AnimationPart(26, new Vector3f(68.0, -19.5, -7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 25);
        this.addPartToSkeleton(new AnimationPart(27, new Vector3f(69.0, -21.5, -7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 26);
        this.addPartToSkeleton(new AnimationPart(28, new Vector3f(17.0f, -31.0f, 7.0f), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 0);
        this.addPartToSkeleton(new AnimationPart(29, new Vector3f(22.0, -20.5, 7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 28);
        this.addPartToSkeleton(new AnimationPart(30, new Vector3f(33.0, -20.5, 7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 29);
        this.addPartToSkeleton(new AnimationPart(31, new Vector3f(68.0, -19.5, 7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 30);
        this.addPartToSkeleton(new AnimationPart(32, new Vector3f(69.0, -21.5, 7.0), new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f)), 31);
    }
    
    public void initPoses() {
        this.addDefaultPose();
        this.addGERWALKPose();
    }
    
    public void addDefaultPose() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 30.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, -30.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 5, 5, false));
        this.poses.add(pose);
    }
    
    public void addGERWALKPose() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(-20.0f, 0.0f, -50.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -100.0f), 2, 16, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(20.0f, 0.0f, -50.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -100.0f), 2, 16, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 160.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 90.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 45.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -45.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 90.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 45.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -45.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        this.poses.add(pose);
        this.addGERWALK2();
    }
    
    public void addGERWALK2() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(-20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 160.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 20.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(15.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(15.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        this.poses.add(pose);
        this.addGERWALK3();
    }
    
    public void addGERWALK3() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(-20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 160.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 20.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(15.0f, -25.0f, 0.0f), new Vector3f(-90.0f, 0.0f, 0.0f), 6, 12, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(15.0f, -25.0f, 0.0f), new Vector3f(90.0f, 0.0f, 0.0f), 6, 12, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        this.poses.add(pose);
        this.addGERWALK4();
    }
    
    public void addGERWALK4() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(-20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(10.0f, 0.0f, 0.0f), new Vector3f(20.0f, 0.0f, -35.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(5.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -75.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 160.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 110.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 20.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(10.0f, -25.0f, -10.0f), new Vector3f(-90.0f, 90.0f, 0.0f), 4, 6, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -80.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-90.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 50.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(23.0f, 0.0f, 0.0f), new Vector3f(180.0f, 0.0f, 0.0f), 2, 20, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(10.0f, -25.0f, 10.0f), new Vector3f(90.0f, -90.0f, 0.0f), 4, 6, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -80.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(90.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 50.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(23.0f, 0.0f, 0.0f), new Vector3f(180.0f, 0.0f, 0.0f), 2, 20, false));
        this.poses.add(pose);
        this.addGERWALK5();
    }
    
    public void addGERWALK5() {
        final AnimationPose pose = new AnimationPose();
        pose.parts.add(new PoseComponent("core", new Vector3f(120.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 90.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("midfront", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 4, false));
        pose.parts.add(new PoseComponent("nose", new Vector3f(20.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftlegtop", new Vector3f(60.0f, 0.0f, -5.0f), new Vector3f(0.0f, 0.0f, -180.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("leftlegmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("leftlegshin", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlegtop", new Vector3f(60.0f, 0.0f, 5.0f), new Vector3f(0.0f, 0.0f, -180.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("rightlegmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 3, false));
        pose.parts.add(new PoseComponent("rightlegshin", new Vector3f(5.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rearbody", new Vector3f(20.0f, 5.0f, 0.0f), new Vector3f(0.0f, 0.0f, -170.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("tailmid", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 160.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("finleft", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("finright", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(100.0f, 0.0f, 0.0f), 2, 14, false));
        pose.parts.add(new PoseComponent("leftwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 20.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightwing", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, -20.0f, 0.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("leftfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 45.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -45.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightknee", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 25, false));
        pose.parts.add(new PoseComponent("rightfoottop", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 45.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("rightfootbottom", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -45.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("head", new Vector3f(0.0f, 6.0f, 0.0f), new Vector3f(180.0f, 0.0f, 90.0f), 2, 8, false));
        pose.parts.add(new PoseComponent("headguns", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 130.0f), 2, 2, false));
        pose.parts.add(new PoseComponent("leftshoulder", new Vector3f(25.0f, -30.0f, 0.0f), new Vector3f(-90.0f, 180.0f, 0.0f), 4, 6, false));
        pose.parts.add(new PoseComponent("leftshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -30.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("leftupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-60.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("leftlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 60.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("lefthand", new Vector3f(23.0f, 0.0f, 0.0f), new Vector3f(180.0f, 0.0f, 0.0f), 2, 20, false));
        pose.parts.add(new PoseComponent("rightshoulder", new Vector3f(25.0f, -30.0f, 0.0f), new Vector3f(90.0f, -180.0f, 0.0f), 4, 6, false));
        pose.parts.add(new PoseComponent("rightshoulderjoint", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightupperarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(90.0f, 0.0f, 0.0f), 2, 6, false));
        pose.parts.add(new PoseComponent("rightlowerarm", new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 10.0f), 2, 12, false));
        pose.parts.add(new PoseComponent("righthand", new Vector3f(23.0f, 0.0f, 0.0f), new Vector3f(180.0f, 0.0f, 0.0f), 2, 20, false));
        this.poses.add(pose);
    }
    
    public void addPartToSkeleton(final AnimationPart p, final int parent) {
        this.parts.add(p);
        if (parent >= 0) {
            final AnimationPart part = this.parts.get(parent);
            part.hasChildren = true;
            part.children.add(p);
            p.parent = parent;
        }
    }
    
    public AnimationPart getCorePart() {
        final AnimationPart part = this.parts.get(0);
        return part;
    }
    
    public void UpdateAnim(final int stat) {
        switch (this.state) {
            case 0: {
                this.pose = this.poses.get(0);
                this.animStage = 1;
                this.timeSinceSwitch = 0;
                break;
            }
            case 1: {
                if (this.animStage == 1) {
                    this.pose = this.poses.get(1);
                    break;
                }
                if (this.animStage == 2) {
                    this.pose = this.poses.get(2);
                    break;
                }
                if (this.animStage == 3) {
                    this.pose = this.poses.get(3);
                    break;
                }
                if (this.animStage == 4) {
                    this.pose = this.poses.get(4);
                    break;
                }
                break;
            }
        }
        boolean animHasFinished = true;
        for (final AnimationPart p : this.parts) {
            p.prevOff = new Vector3f(p.offset.x, p.offset.y, p.offset.z);
            p.prevRot = new Vector3f(p.rotation.x, p.rotation.y, p.rotation.z);
            if (this.pose != null) {
                final PoseComponent q = this.pose.parts.get(p.type);
                if (!this.checkIfFinished(p.offset, q.position)) {
                    p.offset = this.transformPart(p.offset, q.position, new Vector3f((float)q.speed1, (float)q.speed1, (float)q.speed1));
                }
                if (animHasFinished) {
                    animHasFinished = this.checkIfFinished(p.offset, q.position);
                }
                if (!this.checkIfFinished(p.rotation, q.rotation)) {
                    p.rotation = this.transformPart(p.rotation, q.rotation, new Vector3f((float)q.speed2, (float)q.speed2, (float)q.speed2));
                }
                if (!animHasFinished) {
                    continue;
                }
                animHasFinished = this.checkIfFinished(p.rotation, q.rotation);
            }
        }
        if (animHasFinished && this.timeSinceSwitch > 2) {
            ++this.animStage;
        }
        ++this.timeSinceSwitch;
    }
    
    public void changeState(final int i) {
        this.state = i;
        this.animStage = 1;
        this.timeSinceSwitch = 0;
    }
    
    public boolean checkIfFinished(final Vector3f a, final Vector3f b) {
        boolean c = true;
        final float d = a.lengthSquared();
        final float e = b.lengthSquared();
        float f = d - e;
        f = (float)Math.sqrt(f * f);
        if (f > 0.0f) {
            c = false;
        }
        return c;
    }
    
    public int getNumberOfStages() {
        int i = 0;
        switch (this.state) {
            case 0: {
                i = 1;
                break;
            }
            case 1: {
                i = 4;
                break;
            }
        }
        return i;
    }
    
    public Vector3f getPositionOnPart(final Vector3f in, final AnimationPart p, final RotatedAxes rot) {
        final Vector3f p2 = p.position;
        final Vector3f p3 = in;
        p.rotateToPartAxis(rot);
        Vector3f trans = new Vector3f(p3.x - p2.x, p3.y - p2.y, p3.z - p2.z);
        trans = rot.findLocalVectorGlobally(trans);
        return trans;
    }
    
    public Vector3f getFullPosition(final Vector3f in, final AnimationPart p) {
        final AnimationPart core = this.getCorePart();
        final Vector3f pos = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f.add(pos, new Vector3f(core.position.x, core.position.y, core.position.z), pos);
        final RotatedAxes rot = new RotatedAxes(0.0f, 0.0f, 0.0f);
        ArrayList<Integer> chain = new ArrayList<Integer>();
        chain = this.generateChain(p, chain);
        for (int i = chain.size() - 1; i > 0; --i) {
            final AnimationPart child = this.parts.get(chain.get(i - 1));
            final AnimationPart part = this.parts.get(chain.get(i));
            final Vector3f tPos = this.getPositionOnPart(Vector3f.add(child.position, new Vector3f(child.offset.x, -child.offset.y, child.offset.z), null), part, rot);
            Vector3f.add(tPos, pos, pos);
        }
        final Vector3f tPos2 = this.getPositionOnPart(in, p, rot);
        Vector3f.add(tPos2, pos, pos);
        return pos;
    }
    
    public ArrayList<Integer> generateChain(final AnimationPart p, final ArrayList<Integer> i) {
        i.add(p.type);
        if (p.parent >= 0) {
            this.generateChain(this.parts.get(p.parent), i);
        }
        return i;
    }
    
    public Vector3f transformPart(final Vector3f current, final Vector3f target, final Vector3f rate) {
        final Vector3f newPos = current;
        if (Math.sqrt((current.x - target.x) * (current.x - target.x)) > rate.x / 2.0f) {
            if (current.x > target.x) {
                current.x -= rate.x;
            }
            else if (current.x < target.x) {
                current.x += rate.x;
            }
        }
        else {
            current.x = target.x;
        }
        if (Math.sqrt((current.y - target.y) * (current.y - target.y)) > rate.y / 2.0f) {
            if (current.y > target.y) {
                current.y -= rate.y;
            }
            else if (current.y < target.y) {
                current.y += rate.y;
            }
        }
        else {
            current.y = target.y;
        }
        if (Math.sqrt((current.z - target.z) * (current.z - target.z)) > rate.z / 2.0f) {
            if (current.z > target.z) {
                current.z -= rate.z;
            }
            else if (current.z < target.z) {
                current.z += rate.z;
            }
        }
        else {
            current.z = target.z;
        }
        return newPos;
    }
}
