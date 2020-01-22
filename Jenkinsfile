pipeline {
         agent any
             stages {
                 stage('Source') {
                    steps {
                        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/DeepaUike/UMAutomationProject.git']]])
                         }        
                 }
                  stage('Build') {
                          tools {
                                jdk 'jdk8'
                                maven 'Maven'
                            }
                            steps {
                                     dir("UMAuto"){
                               powershell 'mvn clean package'
                                     }
                            }
                  }
                  stage('Code Quality') {
                   steps {
                        script{
                             withSonarQubeEnv(installationName: 'SonarQube'){
                                    bat label: '', script: 'mvn sonar:sonar'
                             }
                        }
                  }

                }
             }

}
