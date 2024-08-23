# SolarSim
SolarSim is a website that lets people experience and discover our solar system with ease.
SolarSim also provides a user-friendly interface that lets everyone learn about the solar system.

## Features
- Accurate physics simulation.
- User-friendly interface.
- Accurate and up-to-date information.

These are just the basic features, SolarSim also provides a variety of other useful features.

## Quick Start
In order to run SolarSim, you need to have [docker](https://www.docker.com/) installed. Docker requires that you
have a computer with virtualization on. **Ensure that you have the Docker service running in the background.**

```bash
# Building the program with Maven.
.\mvnw package -DskipTests

# Starting the Docker application.
docker compose up --build

# Closing the Docker application.
# (!!!) This removes all the containers and their data.
docker compose down
```

## Setup
The project is set up with [Springboot](https://spring.io/projects/spring-boot). Springboot hosts the server listed on the port specified in the 
`docker-compose.yml` files at their respective ports. The project also makes use of [PostgreSQL](https://www.postgresql.org) in order to manage and store
data. 

The frontend files are stored in the directory `src/main/resources/static` while the backend files are stored within `src/main/java`.

## Roadmap
As SolarSim is still a work in progress, many features are still yet to be added.