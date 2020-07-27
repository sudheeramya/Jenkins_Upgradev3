job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/sudheeramya/Jenkins_Upgradev3.git", 'master')
    }
    
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
   
}
