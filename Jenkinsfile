pipeline{

    agent any

    stages {

        stage ('Compile ') {

            steps {

                withMaven(maven: 'maven_3_8_7') {
                    bat 'mvn clean install'   } } }
	    
	    
	    
	    
          stage ('Test') {

                steps {

                withMaven(maven: 'maven_3_5_0') {
			bat 'mvn test'       } } }


	    
	    
        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'   } }

    }

}
