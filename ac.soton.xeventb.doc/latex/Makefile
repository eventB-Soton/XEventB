default: pdfs

all: pdfs htmls

##### Making PDFs (BEGIN) #####
pdfs: user_manual.pdf

user_manual.pdf: $(shell find . -name "*.tex" -type f) $(shell find . -name "*.sty" -type f)
	pdflatex user_manual.tex
	pdflatex user_manual.tex

##### Making PDFs (END) #####

##### Making HTMLs (BEGIN) #####

htmls: user_manual-html

user_manual-html: ../html/index.html

../html/index.html: plastex.sty $(shell find . -name "*.tex" -type f) $(shell find . -name "*.sty" -type f)
	rm -rf ../html
	plastex -d ../html/ --theme=python user_manual.tex
	sed -i.bak -f sed_commands ../html/eclipse-toc.xml

##### Making HTMLs (END) #####

##### Clean (BEGIN) #####

clean:
	rm -rf *.aux *.log *.rel *.paux *.out *.synctex.gz *.toc

clean-all:
	rm user_manual.pdf
##### Clean (END) #####
