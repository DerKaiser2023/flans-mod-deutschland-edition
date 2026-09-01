#!/bin/bash
set -e

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
MODS_DIR="$SCRIPT_DIR/mods"
LIBS_DIR="$SCRIPT_DIR/libs"

mkdir -p "$LIBS_DIR"

echo "Copying dependency jars to $LIBS_DIR..."
cp -f "$MODS_DIR"/Xenofactions*.jar "$LIBS_DIR/" 2>/dev/null || true
cp -f "$MODS_DIR"/RX-RNTM*.jar "$LIBS_DIR/" 2>/dev/null || true

echo "Done. Jars in $LIBS_DIR:"
ls -la "$LIBS_DIR"
