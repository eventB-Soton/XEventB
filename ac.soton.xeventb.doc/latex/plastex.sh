#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"
HTML_FOLDER=$2

echo "rm -rf $HTML_FOLDER"
rm -rf $HTML_FOLDER

echo "plastex -d $HTML_FOLDER --theme=python $TEXFile"
plastex -d $HTML_FOLDER --theme=python $TEXFile

echo "sed -f sed_commands -i '' $HTML_FOLDER/eclipse-toc.xml"
sed -f sed_commands -i '' $HTML_FOLDER/eclipse-toc.xml
