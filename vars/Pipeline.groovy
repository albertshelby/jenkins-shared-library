def call (String name){
    stage("Hola mundo"){
        agent{any}
        sh "echo \"Hello ${name}\""
    }
}