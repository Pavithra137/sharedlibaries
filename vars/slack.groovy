#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    emailext body: '''Environment:       Production
Build URL:          $BUILD_URL
Project:              $JOB_NAME
Build Number:     $BUILD_NUMBER
Build Result:       $BUILD_STATUS
''', subject: 'STC IMS JENKINS BUILD STATUS', to: 'coolpavi193@gmail.com'
  }
//   else if( buildResult == "FAILURE" ) { 
//     slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
//   }
//   else if( buildResult == "UNSTABLE" ) { 
//     slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable"
//   }
//   else {
//     slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear"	
//   }
}
