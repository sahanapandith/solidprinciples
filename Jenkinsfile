pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and run Java code
                bat 'javac -sourcepath src -d out ispviolation/OnlineCustomer.java'
                bat 'java -cp out ispviolation/OnlineCustomer'
            }
        }
    }
}
