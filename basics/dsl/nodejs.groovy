job('NodeJS example') {
    scm {
        git('https://github.com/elad6456/docker-cicd.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    //wrappers {
    //    nodejs('nodejs') // this is the name of the NodeJS installation in 
    //                     // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    //}
    steps {
        shell("npm install")
    }
}

job('EladJob example') {
    scm {
        git('https://github.com/elad6456/docker-cicd.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    //wrappers {
    //    nodejs('nodejs') // this is the name of the NodeJS installation in 
    //                     // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    //}
    steps {
        shell("docker build -t test:test .")
    }
}


