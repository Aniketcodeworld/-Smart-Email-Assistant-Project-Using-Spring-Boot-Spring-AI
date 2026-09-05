
# Smart AI Email Assistant

> An AI-powered email reply generator built with Java, Spring Boot, Spring AI, Google Gemini API, and a Chrome Extension.

## Overview

Smart AI Email Assistant is a full-stack Generative AI application designed to help users write email responses quickly and efficiently.

The application integrates a Chrome Extension directly into the email interface and provides an **AI Reply** feature. Users can select their preferred communication tone, and the application generates a context-aware email response using Google's Gemini Large Language Model (LLM).

This project demonstrates the practical implementation of **Generative AI, Large Language Models (LLMs), Spring Boot, RESTful APIs, API integration, and browser extension development** in a real-world productivity application.

---

## Features

* AI-powered email reply generation
* Context-aware responses based on email content
* Multiple communication tone options
* Chrome Extension integration
* AI Reply button directly within the email interface
* RESTful API architecture
* Google Gemini API integration
* Spring AI integration
* Fast and automated email response generation
* Clean separation between frontend extension and backend services

---

## Tech Stack

### Backend

* Java
* Spring Boot
* Spring AI
* Spring Web
* RESTful APIs
* Maven

### Artificial Intelligence

* Google Gemini API
* Generative AI
* Large Language Models (LLMs)
* Prompt Engineering

### Browser Extension

* Chrome Extension
* JavaScript
* HTML
* CSS
* Chrome Extension APIs

---

## System Architecture

The application follows a client-server architecture where the Chrome Extension communicates with the Spring Boot backend, which processes requests using the Google Gemini AI model.

```text
+-----------------------+
|   Email Interface     |
|       (Gmail)         |
+-----------+-----------+
            |
            | Email Content
            v
+-----------------------+
|   Chrome Extension    |
|                       |
|  - AI Reply Button    |
|  - Tone Selection     |
+-----------+-----------+
            |
            | REST API Request
            v
+-----------------------+
|   Spring Boot API     |
|                       |
|  - Request Handling   |
|  - Prompt Generation  |
|  - AI Integration     |
+-----------+-----------+
            |
            | AI Request
            v
+-----------------------+
|  Google Gemini API    |
|                       |
|  Large Language Model |
+-----------+-----------+
            |
            | Generated Reply
            v
+-----------------------+
|   Spring Boot API     |
+-----------+-----------+
            |
            | API Response
            v
+-----------------------+
|   Chrome Extension    |
+-----------+-----------+
            |
            v
+-----------------------+
|  Generated AI Reply   |
+-----------------------+
```

---

## How It Works

### 1. Open an Email

The user opens an email within the supported email interface.

### 2. Click AI Reply

The Chrome Extension provides an **AI Reply** button directly within the email workflow.

### 3. Select a Tone

The user can choose a preferred tone for the response, such as:

* Professional
* Friendly
* Formal
* Casual

### 4. Email Content Is Processed

The Chrome Extension extracts the relevant email content and sends it to the Spring Boot backend through a REST API.

### 5. AI Generates a Response

The backend uses Spring AI to communicate with the Google Gemini API. A structured prompt is generated using the email content and selected tone.

### 6. Generated Reply Is Displayed

The AI-generated response is returned to the Chrome Extension and displayed to the user.

---

## API Workflow

The communication flow follows this pattern:

```text
Chrome Extension
       |
       | POST Request
       v
Spring Boot REST API
       |
       | Prompt Processing
       v
Spring AI
       |
       | AI Request
       v
Google Gemini API
       |
       | Generated Response
       v
Spring Boot API
       |
       | JSON Response
       v
Chrome Extension
```

---

## Example Request

The Chrome Extension sends the email content and selected tone to the backend.

```json
{
  "emailContent": "Thank you for contacting us. Could you please provide more information about the project timeline?",
  "tone": "Professional"
}
```

---

## Example Generated Response

```text
Hello,

Thank you for reaching out. I would be happy to provide more information regarding the project timeline.

Please let me know if you have any specific requirements or deadlines, and I will share the relevant details accordingly.

Best regards
```

---

## Project Structure

```text
Smart-AI-Email-Assistant/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── email/
│   │   │   │           ├── controller/
│   │   │   │           ├── service/
│   │   │   │           └── model/
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │
│   └── pom.xml
│
├── chrome-extension/
│   ├── manifest.json
│   ├── content.js
│   ├── background.js
│   ├── popup.html
│   └── popup.js
│
└── README.md
```

---

## Installation and Setup

### Prerequisites

Make sure you have the following installed:

* Java 17 or later
* Maven
* Google Gemini API Key
* Google Chrome

---

## Backend Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Aniketcodeworld/-Smart-Email-Assistant-Project-Using-Spring-Boot-Spring-AI.git
```

### 2. Navigate to the Project

```bash
cd -Smart-Email-Assistant-Project-Using-Spring-Boot-Spring-AI
```

### 3. Configure Environment Variables

Add your Google Gemini API key to your application configuration.

Example:

```properties
spring.ai.google.genai.api-key=YOUR_GEMINI_API_KEY
```

> Never commit your API key to a public GitHub repository. Use environment variables or a `.env` file for sensitive credentials.

### 4. Run the Spring Boot Application

Using Maven:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

The backend application will start on the configured local server.

---

## Chrome Extension Setup

1. Open Google Chrome.
2. Navigate to:

```text
chrome://extensions/
```

3. Enable **Developer Mode**.
4. Click **Load Unpacked**.
5. Select the Chrome Extension project folder.
6. Open the supported email interface.
7. Look for the **AI Reply** button.

---

## Key Technical Concepts Demonstrated

This project demonstrates practical experience with:

* Java Backend Development
* Spring Boot
* Spring AI
* RESTful API Development
* Google Gemini API Integration
* Generative AI
* Large Language Models (LLMs)
* Prompt Engineering
* Chrome Extension Development
* Client-Server Architecture
* API Integration
* JSON Data Processing
* Browser Automation
* Full-Stack Application Development

---

## Challenges and Learning Outcomes

### Integrating Generative AI

The project required integrating a Large Language Model with a traditional backend application. Spring AI simplifies communication between the Spring Boot application and AI models.

### Context-Aware Response Generation

Generating useful responses requires providing the AI model with relevant email context and clear instructions about the desired communication tone.

### Chrome Extension Integration

The Chrome Extension bridges the gap between the user interface and the backend service by extracting relevant email content and communicating with REST APIs.

### Prompt Engineering

Prompts are structured to provide:

* Email context
* User-selected tone
* Clear instructions
* Expected response format

This helps generate more relevant and personalized responses.

---

## Future Improvements

* [ ] Support for multiple email platforms
* [ ] Email conversation history and context awareness
* [ ] Custom response templates
* [ ] Multiple AI model support
* [ ] Streaming AI responses
* [ ] User authentication and authorization
* [ ] Response editing and regeneration
* [ ] Multilingual email support
* [ ] Email grammar and sentiment analysis
* [ ] Deployment using Docker and cloud platforms

---

## Why This Project?

Email communication is an essential part of professional and personal workflows. Writing thoughtful responses can be time-consuming.

Smart AI Email Assistant demonstrates how **Generative AI can be integrated into existing user workflows** to automate repetitive tasks and improve productivity.

Rather than requiring users to copy and paste email content into a separate AI application, this project brings AI capabilities directly into the email experience through a Chrome Extension.

---

## Recruiter Highlights

This project demonstrates hands-on experience with:

* Building production-style Java and Spring Boot applications
* Integrating Large Language Models into backend systems
* Working with the Google Gemini API
* Using Spring AI for AI application development
* Designing and consuming RESTful APIs
* Developing browser extensions
* Implementing Generative AI solutions for real-world use cases
* Understanding prompt engineering and AI-driven automation

---

## Author

**Aniket Mishra**

Aspiring Software Engineer and AI Engineer passionate about building intelligent, scalable, and user-focused applications.

### Connect With Me

* GitHub: https://github.com/Aniketcodeworld
* LinkedIn: Add your LinkedIn profile link here

---

## Repository

If you found this project useful, consider giving it a star.

**GitHub Repository:**
https://github.com/Aniketcodeworld/-Smart-Email-Assistant-Project-Using-Spring-Boot-Spring-AI

---

### Built With

**Java | Spring Boot | Spring AI | Google Gemini API | Generative AI | LLMs | REST APIs | Chrome Extension**
