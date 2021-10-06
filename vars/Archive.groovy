#!/usr/bin/env groovy
def call() {
    
  sh 'zip branch-${GIT_BRANCH}-build-${BUILD_NUMBER}.zip ./dist/* '
archiveArtifacts artifacts: '*.zip', followSymlinks: false, allowEmptyArchive: true
 
}
       