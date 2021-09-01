void call(){
    
    stage("Maven: Build"){
        println "build from the maven libraryyyyy"
      //  withDockerContainer("maven:3.5.0-jdk-8-alpine") { sh "mvn -v"}        
    }
}
