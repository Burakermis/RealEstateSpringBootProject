# Getir Patika Bootcamp
# Real Estate Spring Boot Application

This is a Spring Boot application designed to simulate a real estate system. The application models different types of houses such as Houses, Villas, and Holiday Homes. It provides various services to calculate total prices, average areas, and filter houses based on the number of rooms and living rooms.

## Features

- **House Types**: Includes `House`, `Villa`, and `Holiday Home` with attributes like price, area, number of rooms, and number of living rooms.
- **Services**: 
  - Calculate total prices for each type of house.
  - Calculate the average area for each type of house.
  - Filter houses based on the number of rooms and living rooms.
  - Calculate the total price for all house types combined.
  - Calculate the average area for all house types combined.

## Technologies Used

- Java 17
- Spring Boot 2.7+
- Maven for dependency management and build automation

## Getting Started

### Prerequisites

- Java 17 or above
- Maven

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Burakermis/RealEstateSpringBootProject.git
    ```
2. Navigate to the project directory:
    ```bash
    cd RealEstateSpringBootProject
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start, and you can check the console for output.

## Usage

The application demonstrates its functionality through a `main` method located in the `RealEstateApplication.java` class. The following operations are performed:

- Total prices for each type of house.
- Average area for each type of house.
- Filtering houses based on the number of rooms and living rooms.

