pipeline{
	
 agent any
    tools {
        maven 'apache-maven-3.8.7'
        jdk 'JAVA_HOME'
    }
    stages {
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/master']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/Maat9090/grupp3Projekt.git']]])
           	checkout scm
        }
    }
		
	    
	    stage ('Build') {
		steps {
		  git url: 'https://github.com/Maat9090/grupp3Projekt.git'	
                 withMaven {
                	bat "mvn clean verify"
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
		}}
	

      
	    
	    
	    
	    
        stage("Cucumber Report"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/master']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/Maat9090/grupp3Projekt.git']]
			 ]) 
		cucumber buildStatus: "UNSTABLE",
		fileIncludePattern: "**/cucumber.json",
                jsonReportDirectory: 'java'}}

                  

    }

}
