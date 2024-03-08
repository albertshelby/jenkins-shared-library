def call (String name){
    stage("Hola mundo"){
        agent{any}
        steps{
            sh "echo \"Hello ${name}\""
        }
    }
}