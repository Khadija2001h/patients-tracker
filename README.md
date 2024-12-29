# README de l'Application de Suivi des Patients

## Table des Matières
1. [Introduction](#introduction)
2. [Fonctionnalités](#fonctionnalités)
3. [Prérequis](#prérequis)
4. [Installation](#installation)
5. [Utilisation](#utilisation)
6. [Structure des Fichiers](#structure-des-fichiers)
7. [Points de Terminaison API](#points-de-terminaison-api)
8. [Améliorations Futures](#améliorations-futures)
9. [Captures d'Écran](#captures-décran)
10. [Contributeurs](#contributeurs)

---

## Introduction
Cette application est conçue pour gérer les données des patients avec un accent sur la surveillance de leur sécurité et le suivi de leur santé. Elle permet la gestion des enregistrements des patients, la définition de zones de sécurité, et la création de notifications en cas de sortie des zones définies.

## Fonctionnalités
- Ajouter, mettre à jour et supprimer des enregistrements de patients.
- Définir et gérer des zones de sécurité à l'aide de coordonnées GPS et d'un rayon.
- Vérifier si les patients se trouvent dans leurs zones de sécurité.
- Créer automatiquement des notifications lorsque les patients quittent leurs zones de sécurité.
- Afficher la dernière visite de chaque patient.
- Récupérer et mettre à jour dynamiquement les coordonnées des patients.

## Prérequis
Avant d'exécuter cette application, assurez-vous d'avoir installé :
- Java Development Kit (JDK) 11 ou supérieur.
- Spring Boot Framework.
- Maven (pour la gestion des dépendances).
- Un système de base de données MySQL.

## Installation
1. Clonez le dépôt :
   ```bash
   git clone <repository_url>
   cd <project_folder>
   ```
2. Compilez le projet avec Maven :
   ```bash
   mvn clean install
   ```
3. Configurez la connexion à la base de données dans le fichier `application.properties`.
4. Lancez l'application :
   ```bash
   mvn spring-boot:run
   ```

## Utilisation
1. Accédez à l'API via :
   - `http://localhost:8080/patients`
   - `http://localhost:8080/notifications`
2. Fonctionnalités disponibles :
   - **Caregiver** :
     - Ajouter de nouveaux patients.
     - Mettre à jour les informations des patients (par exemple, coordonnées, détails personnels).
     - Vérifier si les patients se trouvent dans leurs zones de sécurité.
     - Récupérer et afficher les détails des patients.
   - **Notifications** :
     - Afficher toutes les notifications.
     - Générer automatiquement des notifications lorsque les patients quittent leurs zones de sécurité.

## Architecture Microservice

![WhatsApp Image 2024-12-29 at 19 10 06](https://github.com/user-attachments/assets/a999a497-1bdc-4578-a50a-524bddb903e7)


## Points de Terminaison API
- **GET /patients** : Récupère tous les patients.
- **POST /patients** : Ajoute un nouveau patient.
- **PUT /patients/{id}** : Met à jour les informations d'un patient.
- **DELETE /patients/{id}** : Supprime un patient.
- **GET /notifications** : Récupère toutes les notifications.
- **POST /notifications** : Crée une nouvelle notification.

## Améliorations Futures
- **Intégration du Machine Learning :**
- Détection des anomalies dans les mouvements des patients grâce à des modèles prédictifs.
- Analyse des tendances pour identifier des comportements inhabituels.
- Amélioration des prédictions de zones à risque en fonction des données historiques.
- Utilisation de frameworks comme TensorFlow et Scikit-learn pour entraîner et déployer des modèles.
- Gestion avancée des données : Collecte et stockage sécurisé des données liées aux patients pour des analyses futures.

## Captures d'Écran
- ## **Partie mobile:**
- 
![WhatsApp Image 2024-12-27 at 23 15 24](https://github.com/user-attachments/assets/f000b3be-2048-47e4-88fb-1948d814039c)
![WhatsApp Image 2024-12-27 at 23 15 25 (1)](https://github.com/user-attachments/assets/4eb830fa-bee3-47a4-b5c1-90d73eeef876)
![WhatsApp Image 2024-12-27 at 23 15 25 (2)](https://github.com/user-attachments/assets/c3c1ac21-988a-41ca-b48e-a6af1355801d)
![WhatsApp Image 2024-12-27 at 23 15 25 (3)](https://github.com/user-attachments/assets/94951fa8-3b67-4c72-8aa7-6f86ea6d575c)
![WhatsApp Image 2024-12-27 at 23 15 25](https://github.com/user-attachments/assets/323b16c0-aa01-4c91-be53-3dc1dc5afb64)

- ## **partie Web:**

![WhatsApp Image 2024-12-27 at 23 48 35](https://github.com/user-attachments/assets/57d6886d-fe08-41ff-b7b5-64b0c7d522ab)
![WhatsApp Image 2024-12-27 at 23 49 09](https://github.com/user-attachments/assets/c6400c0b-9893-446e-bea4-b89043556353)
![WhatsApp Image 2024-12-27 at 23 49 51](https://github.com/user-attachments/assets/2deda1e9-b2fc-4323-877b-87aa22ce6a11)
![WhatsApp Image 2024-12-27 at 23 45 49](https://github.com/user-attachments/assets/ba8e7e2b-869b-4a6c-a07c-c32fbe2820cd)
![WhatsApp Image 2024-12-27 at 23 46 32](https://github.com/user-attachments/assets/c0e2854d-3b45-4fe7-ba54-e1c59deaae6a)
![WhatsApp Image 2024-12-27 at 23 47 27](https://github.com/user-attachments/assets/c8c03c42-faf2-4ced-b2f4-e9a2adb90628)

## lien video mobile:
https://drive.google.com/file/d/12Z9SHIYOhFAFDdi8g01JisZlI85RGGwG/view?usp=sharing

## Contributeurs
- **Ayda aboufaress**
- **Ayoub Hakmaoui** 
- **Khadija Ezzahidi**
- **Mohamed-el habib Tblioua**
- **Salma Idmansour** 
