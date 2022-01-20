def call(){
    echo "${scm.userRemoteConfigs[0].url}"
  
    withSonarQubeEnv('sonarqube') {
        sh "./gradlew sonarqube"
              
}
}