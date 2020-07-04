#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"

rm -r wiki
mkdir wiki
cd ../.tmp_PANDOC

echo "pandoc --to mediawiki --listings -o ../wiki/$BASENAME.wiki $TEXFile"
pandoc --to mediawiki --listings -o ../wiki/$BASENAME.wiki $TEXFile
cp -r ./figures ../wiki
