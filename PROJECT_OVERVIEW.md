# School Homepage - Image Composable Implementation

## Project Overview

This Android application implements a **School Homepage as an Image Composable** using Jetpack Compose. The project displays a complete school homepage with an emphasis on visual presentation through composable UI components.

## Key Features Implemented

### 🏫 School Image Composable
- **`SchoolImageComposable()`** - A dedicated composable function that displays the school logo as an image
- Featured prominently in the center of the homepage
- Wrapped in a Material Design Card with elevation and rounded corners
- Uses a custom vector drawable school logo

### 🎨 Visual Design
- **Custom School Logo** - Vector drawable featuring a school building with:
  - Blue building structure representing academic excellence
  - Windows, door, and flag details
  - Professional, educational appearance
  
- **Material Design 3 Theming**:
  - School-branded color scheme (blue primary, orange secondary)
  - Gradient background for visual appeal
  - Consistent typography and spacing

### 📱 Homepage Layout
- **Header Section**: Welcome message, school name, and motto
- **Central Image**: School logo as the main focal point (Image Composable)
- **Information Cards**: About, Mission, and Campus Facilities
- **Scrollable Layout**: Accommodates all content comfortably

## Technical Implementation

### Android Project Structure
```
app/
├── src/main/
│   ├── java/com/example/assignment1/
│   │   └── MainActivity.kt                 # Main Compose UI
│   ├── res/
│   │   ├── drawable/
│   │   │   └── school_logo.xml            # Vector school logo
│   │   ├── values/
│   │   │   ├── strings.xml                # App strings
│   │   │   ├── colors.xml                 # Color definitions
│   │   │   └── themes.xml                 # Material themes
│   │   └── mipmap-*/
│   │       └── ic_launcher*.xml           # App icons
│   └── AndroidManifest.xml               # App configuration
├── build.gradle                          # App dependencies
└── proguard-rules.pro                    # Build optimization
```

### Core Composables

#### 1. SchoolImageComposable()
```kotlin
@Composable
fun SchoolImageComposable() {
    Card(
        modifier = Modifier
            .size(250.dp)
            .clip(RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.school_logo),
                contentDescription = "School Logo",
                modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}
```

#### 2. SchoolHomepage()
- Complete homepage layout with Material Design components
- Gradient background for visual appeal
- Responsive card-based information architecture
- Scrollable content for mobile optimization

### Dependencies Used
- **Jetpack Compose** - Modern UI toolkit
- **Material Design 3** - Latest Material Design components
- **Activity Compose** - Activity integration for Compose
- **Core KTX** - Kotlin extensions for Android

## Assignment Requirements Met

✅ **Display school homepage** - Complete homepage with school information  
✅ **As an image composable** - Dedicated `SchoolImageComposable()` function  
✅ **Visual presentation** - Custom school logo and professional design  
✅ **Android best practices** - Proper project structure and Material Design  

## Running the Application

This is a complete Android Studio project. To run:

1. Open in Android Studio
2. Sync Gradle dependencies
3. Run on Android device or emulator
4. The school homepage will display with the image composable prominently featured

## School Information Displayed

- **School Name**: University of Excellence
- **Motto**: Learning for Excellence
- **Features**: Modern facilities, excellent academics, holistic development
- **Visual Identity**: Custom school building logo design

The image composable serves as the centerpiece of the homepage, providing immediate visual recognition and branding for the educational institution.