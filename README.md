# IMADASSIGNMENT2
# 📚 Kotlin Flashcard Quiz App

## 🎯 Overview

This is a native Android application developed in Kotlin using Android Studio. The app is designed as an interactive flashcard quiz tool to help users study history through True/False questions. It presents five questions, scores the user's answers, gives instant feedback, and provides a summary at the end.

---

## 🧠 Features

- **Welcome Screen**
  - Displays a short description and a welcome message.
  - Includes a "Start" button to begin the quiz.

  - ![welcome screen](https://github.com/user-attachments/assets/93cb7381-412d-48b2-ae4e-ba67650b2d56)



- **Flashcard Question Screen**
  - Presents one True/False question at a time.
  - Provides immediate feedback after answering.
  - "Next" button to continue through the quiz.

  - ![image](https://github.com/user-attachments/assets/fb0b0b5b-6d65-48b2-acf3-597cee1fa242)


- **Score Screen**
  - Shows total number of correct answers.
  - Displays personalized feedback based on performance.
  - Offers a "Review" button to go over all questions and correct answers.
  - Exit button closes the app.
  - 

---

## 🛠️ Application Logic

- Two **parallel arrays** are used: one for questions and one for the correct answers.
- A **score counter** is initialized to zero.
- A **loop** runs through all five questions.
  - For each question:
    - The user selects "True" or "False."
    - The app displays “Correct!” or “Incorrect.”
    - Score is updated accordingly.
- After the final question:
  - The Score Screen appears with total marks and feedback.
  - If the user scores 3 or more, they see “Great job!”
  - If under 3, the message reads “Keep practising!”


## 🚀 Tech Stack

- **Language:** Kotlin
- **IDE:** Android Studio
- **Version Control:** Git and GitHub
- **CI/CD:** GitHub Actions

---

## 📂 Folder Structure


📁 FlashcardQuizApp/
├── 📁 app/
│ └── 📁 src/
│ └── 📁 main/
│ ├── AndroidManifest.xml
│ ├── 📁 java/
│ │ └── com.example.flashcardquiz/
│ │ ├── MainActivity.kt
│ │ ├── QuestionActivity.kt
│ │ └── ScoreActivity.kt
│ └── 📁 res/
│ ├── layout/
│ ├── drawable/
│ └── values/
└── .github/
└── workflows/
└── android.yml

## ✅ How to Run the App

1. Clone the repository:
2. Open the project in **Android Studio**.
3. Connect an Android device or emulator.
4. Click **Run**.
   
## ⚙️ GitHub Actions

A CI workflow using **GitHub Actions** has been added to:
- Build the project on each commit.
- Ensure code compiles and passes basic checks.

Workflow file: `.github/workflows/android.yml`

## 📘 References

1. [Android Developers Documentation – Kotlin](https://developer.android.com/kotlin)
2. [Android Jetpack Components](https://developer.android.com/jetpack)
3. [GitHub Actions for Android](https://docs.github.com/en/actions/guides/building-and-testing-android)
4. [Material Design Guidelines](https://m3.material.io/)
5. YouTube video, added by CrashCourse [Online]. Available at: https://www.youtube.com/watch?v=qPix_X-9t7E (Accessed: 29 April 2025).
6. The Independent Institute of Education. Available at: https://github.com/your-username/flashcard-kotlin-app (Accessed: 29 April 2025).
rashCourse (2015) The Nervous System: CrashCourse Biology

## 👤 Author

Developed by: Rixile Ndlovu  
Student ID: ST10478025  
Institution: Rosebank College

## 📄 License

This project is for educational purposes and not intended for commercial use. No license is applied.







 
