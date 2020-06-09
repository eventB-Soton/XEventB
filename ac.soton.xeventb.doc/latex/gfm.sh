#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"

cd ../.tmp_PANDOC

echo "pandoc --to gfm --listings -o ../latex/$BASENAME.md $TEXFile"
pandoc --to gfm --listings -o ../latex/$BASENAME.md $TEXFile
