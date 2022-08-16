def checkout_git() {
    
    echo "This is for checking out git code."
   git credentialsId: '17390d8a-0226-47a9-b764-812df56ad510', url: 'git@github.com:omeshvalyal/maven-hello-world.git'    
}
return this