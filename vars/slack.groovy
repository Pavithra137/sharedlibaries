#!/usr/bin/env groovy

// def newslack() {
// slackSend channel: '#devops', message: "jenkins status Build_URL : ${BUILD_URL} \n Job_Name : ${JOB_NAME}\n  Build_Number: ${BUILD_NUMBER} \n BuilD_status: ${BUILD_STATUS}"
// }

def call() {
 sh """
 ls
 mkdir new
 cd new
 echo "hello" > 1.txt
 cat 1.txt
 """
}
