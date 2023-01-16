pipeline {
    agent any
   
    stages {
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/master']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/Maat9090/grupp3Projekt.git']]
    ])
           	checkout scm
        }
    }
		
	    
	    	
	stage ('Build ') {
		steps {
                      withMaven(maven : 'maven_3_8_7') {
                      	bat "mvn clean verify"
                        } 
		}}
	
	    
}
