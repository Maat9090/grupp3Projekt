pipeline{

    agent any

    stages {

        stage ('Compile ') {

            steps {

                withMaven(maven: 'maven_3_8_7') {
                    bat 'mvn clean install'   } } }
	    
	    
	    
	    
          stage ('Test') {

                steps {

                withMaven(maven: 'maven_3_8_7') {
			bat 'mvn test'       } } }


	    
	    
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
                jsonReportDirectory: 'target'}}

                  

    }

}
