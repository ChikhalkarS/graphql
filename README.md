# Spring Boot and GraphQL E-commerce API

This repository contains a Spring Boot application that serves as a GraphQL API for an e-commerce platform. It includes backend functionality for managing products and categories.

## Features

- **GraphQL API**: Query products, categories, and more with GraphQL.
- **Product Management**: Add, update, and delete products.
- **Category Management**: Organize products into categories.

## Technologies Used

- Java
- Spring Boot
- GraphQL
- Gradle

## Getting Started

### Prerequisites

- JDK 11 or newer

### Setup

1. Clone the repository:

   \```bash
   git clone <repository-url>
   \```

2. Navigate to the project directory:

   \```bash
   cd <project-directory>
   \```

### Backend

1. Build the project with Gradle:

   \```bash
   ./gradlew build
   \```

2. Run the Spring Boot application:

   \```bash
   ./gradlew bootRun
   \```

## Usage

Once the application is running, you can access the GraphQL API at `http://localhost:8080/graphql`.

### Example GraphQL Queries

- Query all products:

  \```graphql
  {
  products {
  id
  name
  price
  description
  category {
  name
  }
  }
  }
  \```

- Query a category by name:

  \```graphql
  {
  categoryByName(name: "Electronics") {
  id
  name
  description
  }
  }
  \```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any bugs or feature requests.

