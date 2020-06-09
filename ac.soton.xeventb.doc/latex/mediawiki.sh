#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"

cd ../.tmp_PANDOC

echo "pandoc --to mediawiki --listings -o ../latex/$BASENAME.wiki $TEXFile"
pandoc --to mediawiki --listings -o ../latex/$BASENAME.wiki $TEXFile
