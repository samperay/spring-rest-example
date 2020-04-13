node {
    def app

    stage('Clone repo') {
       checkout scm
    }

    stage('clean install') {
       sh 'mvn -f ./spring-rest-example/pom.xml clean install'
    }
        
    stage('build docker image') {
       def dockerfile =  './spring-rest-example/Dockerfile'
       app = docker.build("sunlnx/spring-docker-pipeline-test", "-f ${dockerfile} ./spring-rest-example")
    }

    stage('push docker image') {
       docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
       app.push("${env.BUILD_NUMBER}")
       app.push("latest")
       }
     echo "Trying to Push Docker Build to DockerHub"
    } 

    stage('start container') {
       sh 'docker run -d -p 9090:9090 sunlnx/spring-docker-pipeline-test'
       echo 'Port exposed on http://localhost:9090/<api>/'
    }
}
