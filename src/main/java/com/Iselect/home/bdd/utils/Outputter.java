package com.Iselect.home.bdd.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.Iselect.home.bdd.entities.User;
import com.Iselect.home.bdd.repositories.UserDao;

@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Project Partner");

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {

        // Checke combien d'objets se trouvent dans la BDD        
        LOG.info("******************");
        LOG.info("Objects in DB : " + userDao.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        User user1 = new User("Tony", "Project Partner", 27);
        LOG.info("******************");
        LOG.info(user1 + " has been created !");
        userDao.save(user1);
        LOG.info(user1 + " has been saved !");
        
    }    
}