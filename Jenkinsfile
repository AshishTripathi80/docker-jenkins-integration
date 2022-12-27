pipeline {
    agent any
    
    tools{
        maven "MAVEN"
    }

    stages {
	
		stage("Checkout code"){
			steps
			{
				checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '1340fcde-5fca-40ae-b0c4-590fc6612398', url: 'https://git.nagarro.com/GITG00641/Java/ashish-tripathi.git']]])
				echo 'Check Out'
			}
        }
        stage('Clean') {
            steps {
                bat 'mvn -f Devops_Assignment/product/pom.xml clean'
                echo 'Cleaning..'
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn -f Devops_Assignment/product/pom.xml compile'
                echo 'Compiling..'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn -f Devops_Assignment/product/pom.xml test'
                echo 'Testing..'
            }
        }
        stage('Packaging') {
            steps {
                bat 'mvn -f Devops_Assignment/product/pom.xml package'
                echo 'Packageing..'
            }
        }
        stage('Install') {
            steps {
                bat 'mvn -f Devops_Assignment/product/pom.xml install'
                echo 'Installing..'
            }
        }
        
      
    }
}
