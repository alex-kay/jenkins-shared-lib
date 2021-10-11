#!/usr/bin/env groovy
def call() {
    
  sh 'zip branch-${BRANCH_NAME}-build-${BUILD_NUMBER}.zip ./dist/* '
archiveArtifacts artifacts: '*.zip', followSymlinks: false, allowEmptyArchive: true
 
}
       