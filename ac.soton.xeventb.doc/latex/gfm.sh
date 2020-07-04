#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"

rm -r gfm
mkdir gfm
cd ../.tmp_PANDOC

echo "pandoc --to gfm --listings -o ../gfm/$BASENAME.md $TEXFile"
pandoc --to gfm --listings -o ../gfm/$BASENAME.md $TEXFile
cp -r ./figures ../gfm
