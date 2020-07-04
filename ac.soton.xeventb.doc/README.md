Documentation project for CamilleX
==================================

The source is in the **latex** folder and is used to generate the documentations in different formats.
- PDF (**user_manual.pdf** in **latex** folder)
- Eclipse Help Contents **html** folder (using *plastex*)
- Media Wiki Contents **user_manual.wiki** (using *pandoc*)
- GitHub-Flavoured Markdown **user_manual.md** (using *pandoc*)
- ePub **user_manual.epub** (using *pandoc*)

Folder Structure
----------------

- *README.md*: This documentation file
- *html*: Eclipse Help Contents output
- *latex*: The LaTeX source
- *gfm*: GitHub-Flavoured Markdown version of the user manual
- *user_manual.epub*: ePub-version of the user manual
- *user_manual.pdf*: PDF version of the user manual
- *wiki*: MediaWiki version of the user manual

Requirements
------------

The following tools are used to build the documentations
- gradle (http://gradle.org/)
- pdflatex
- plastex (https://github.com/plastex/plastex). We use version 1.0.0
  which required pip for Python 2. (install via *pip install
  plastex==1.0.0*). The latest version of plastex (2.1) fails to
  generate the Eclipse Help contents.
- gpp (preprocessing) (https://logological.org/gpp) (install via *brew*)
- sh
- sed
- imagemagick (install via brew)

Build
-----

To build, run *gradle* in the **latex** folder.


Instructions for LaTeX source
-----------------------------

Since a single source is used, we need to restrict the LaTeX
source. In particular, we use *gpp* preprocessing for our LaTeX code to
produce different sources for the different word processing, i.e., LATEX,
PLASTEX and PANDOC. More specifically, we use *\ifdef* and *\ifndef*
directives to include/exclude text for each of the option, as shown in
the following examples.
````
\ifdef{LATEX}
This is included in the source for LaTeX
\else
This is omitted in the source for LaTeX
\end
````
and
````
\ifndef{PANDOC}
This is omitted in the source for Pandoc
\else
This is included in the source for Pandoc
\end
````

Due to these directives, the source code need to go through *gpp*
before can be compiled using *pdflatex*, *pandoc* or *plastex*. A
Gradle build script has been prepared for such purpose.  The script
create a source folder separately, e.g., *.tmp_LATEX* (in the root
folder) for LaTeX source by preprocessing all the .tex files. For a
source file *file.tex*, the following command applies.
````
gpp -T -DLATEX=1 file.tex -out ../.tmp_LATEX/file.tex
````
(similarly for other flags, i.e., *PANDOC* and *PLASTEX*)

### LaTeX source folder structure ###
All source files (_*.tex_, _*.sty_, **.cls*) are in the direct folder
*latex*. Figures are in sub-folder *figures* and this folder will be copied to
the output for GFM and MediaWiki. Any figure generated during the
build (e.g., from *TikZ* sources) should also be copied into this
*figures* folder.
