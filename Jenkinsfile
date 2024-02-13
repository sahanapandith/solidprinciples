pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code
                bat 'javac -sourcepath src -d out solidprinciples/SolidPrinciples.java'
                bat 'java -cp out SolidPrinciples.java'
            }
        }
    }
}
