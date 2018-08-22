#!/bin/bash

URL=https://raw.githubusercontent.com/forcedotcom/salesforcedx-vscode/b3e22a1cefb1af09bafe279582b877c0bc7c006e/packages/salesforcedx-vscode-apex/out/apex-jorje-lsp.jar
VERSION=2018-08-17
FILENAME=apex-jorje-lsp-${VERSION}.jar
FILENAME_MINIMIZED=apex-jorje-lsp-minimized-${VERSION}.jar


function install() {
    mvn install:install-file -Dfile=${FILENAME_MINIMIZED} \
                             -DgroupId=apex \
                             -DartifactId=apex-jorje-lsp-minimized \
                             -Dversion=${VERSION} \
                             -Dpackaging=jar \
                             -DlocalRepositoryPath=.
}

function download() {
    curl -o $FILENAME $URL
}


function minimize() {
    unzip -d temp ${FILENAME}
    pushd temp
    find . -not -path "." \
        -and -not -path ".." \
        -and -not -path "./apex*" \
        -and -not -path "./StandardApex*" \
        -and -not -path "./messages*" \
        -and -not -path "./com" \
        -and -not -path "./com/google" \
        -and -not -path "./com/google/common*" \
        -print0 | xargs -0 rm -rf
    popd
    jar --create --file ${FILENAME_MINIMIZED} -C temp/ .
    rm -rf temp
}

function cleanup() {
    rm ${FILENAME}
    rm ${FILENAME_MINIMIZED}
}


download
minimize
install
cleanup



