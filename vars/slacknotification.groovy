#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" || buildResult == "FAILURE" || buildResult == "UNSTABLE" ) {
    slackSend channel: '#devops', message: "jenkins status \n Build_URL : ${env.BUILD_URL} \n Job_Name : ${env.JOB_NAME}\n  Build_Number: ${env.BUILD_NUMBER} \n BuilD_status: ${currentBuild.currentResult}"
  }
  
//   else if( buildResult == "FAILURE" ) { 
//     slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
//   }
//   else if( buildResult == "UNSTABLE" ) { 
//     slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable"
// //   }
//   else {
//     slackSend channel: '#devops', message: "jenkins status Build_URL : ${env.BUILD_URL} \n Job_Name : ${env.JOB_NAME}\n  Build_Number: ${env.BUILD_NUMBER} \n BuilD_status: ${env.BUILD_STATUS}"
//   }
}
