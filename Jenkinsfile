pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code
                bat 'javac -sourcepath src -d out ispviolation/main.java'
                bat 'java -cp out main'
            }
        }
    }
}
