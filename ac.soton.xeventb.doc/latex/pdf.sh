#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"
cd ../.tmp_LATEX
pdflatex $TEXFile
pdflatex $TEXFile
pdflatex $TEXFile
cp user_manual.pdf ../latex
