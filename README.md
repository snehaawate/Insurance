

**An insurance mobile application for quick purchase of insurance products illustrating Android development best practices with Android Jetpack and incoporating additional functions and libraries to achive a mobile app with advanced functionalities and performance**

I'm building this app using https://github.com/googlesamples/android-sunflower sample project as my base source code.

Due to the term of engagement with the client, this repo contains just part of the whole source code.


**Don't ever re-invent the wheel.**

**Sample API response JSON**

This are used to by the app to build it's content dynamically

This JSON String below list the all the Insurance Products available
```
{
    "status": true,
    "message": 200,
    "data": [
        {
            "product_code": "P1700006",
            "product_name": "PROPERTY PROTECT PLAN",
            "description": "protection against fire, buglary and theft",
            "category_code": "F",
            "category_name": "FIRE AND BURGLARY",
            "category_link": "GENERAL",
            "multiple_detail": "1",
            "renewable": "1",
            "multiple_payment": null,
            "product_icon": "fa-bank",
            "policy_numbering": "HOM{y}.|000000",
            "duration": 366,
            "featured": "Y",
            "status": "1",
            "comm_rate": "0"
        },
        {
            "product_code": "P1700005",
            "product_name": "PERSONAL ACCIDENT LITE",
            "description": "Li Europan lingues es membres del sam familie. Lor separat existentie es un myth. Por scientie, musica, sport etc, litot Europa usa li sam vocabular. Li lingues differe solmen in li grammatica, li pronunciation e li plu commun vocabules. Omnicos directe al desirabilite de un nov lingua franca: On refusa",
            "category_code": "G",
            "category_name": "GENERAL ACCIDENT",
            "category_link": "GENERAL",
            "multiple_detail": "1",
            "renewable": "1",
            "multiple_payment": null,
            "product_icon": "fa-ambulance",
            "policy_numbering": "PAC.|000000|{Y}",
            "duration": 5479,
            "featured": "Y",
            "status": "1",
            "comm_rate": "0"
        },
        {
            "product_code": "P1700003",
            "product_name": "MOTOR COMPREHENSIVE LITE",
            "description": "The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ in their grammar, their pronunciation and their most common words. Everyone realizes why a new common language would be desirable: one",
            "category_code": "V",
            "category_name": "MOTOR",
            "category_link": "GENERAL",
            "multiple_detail": "1",
            "renewable": "1",
            "multiple_payment": null,
            "product_icon": "fa-car",
            "policy_numbering": "MTP.{y}.|000000|.V",
            "duration": 366,
            "featured": "Y",
            "status": "1",
            "comm_rate": "6.25"
        },
        {
            "product_code": "P1700004",
            "product_name": "MOTOR THIRD PARTY",
            "description": "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate",
            "category_code": "V",
            "category_name": "MOTOR",
            "category_link": "GENERAL",
            "multiple_detail": "1",
            "renewable": "1",
            "multiple_payment": null,
            "product_icon": "fa-car",
            "policy_numbering": "MTP.{y}.|000000|.V",
            "duration": 366,
            "featured": "Y",
            "status": "1",
            "comm_rate": "12.5"
        },
        {
            "product_code": "P1700001",
            "product_name": "TRAVELS",
            "description": "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui",
            "category_code": "T",
            "category_name": "TRAVELS",
            "category_link": "GENERAL",
            "multiple_detail": null,
            "renewable": null,
            "multiple_payment": null,
            "product_icon": "fa-briefcase",
            "policy_numbering": "TRV.{y}.|000000|.T",
            "duration": 14,
            "featured": "Y",
            "status": "1",
            "comm_rate": "10"
        },
        {
            "product_code": "P1700007",
            "product_name": "SIMPLE INVESTMENT",
            "description": "An affordable life and investment plan with money back fuaranty",
            "category_code": "I",
            "category_name": "INVESTMENT PLAN",
            "category_link": "LIFE",
            "multiple_detail": null,
            "renewable": null,
            "multiple_payment": "1",
            "product_icon": "fa-money",
            "policy_numbering": "SIP.{y}.|000000",
            "duration": 31,
            "featured": "Y",
            "status": "1",
            "comm_rate": "0"
        },
        {
            "product_code": "P1700002",
            "product_name": "SIMPLE LIFE",
            "description": "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects,",
            "category_code": "L",
            "category_name": "TERM ASSURANCE",
            "category_link": "LIFE",
            "multiple_detail": null,
            "renewable": null,
            "multiple_payment": "1",
            "product_icon": "fa-umbrella",
            "policy_numbering": "MLP.{y}.|000000|.L",
            "duration": 366,
            "featured": "Y",
            "status": "1",
            "comm_rate": "20"
        }
    ]
}

```

This JSON String below is used to provide more details on a selected product and contains the formula used in calculating a premium to be paid based on the filled input field available for that product. This is unique for insurance product.

```
{
    "status": true,
    "message": 200,
    "data": {
        "product_code": "P1700007",
        "product_name": "SIMPLE INVESTMENT",
        "description": "An affordable life and investment plan with money back fuaranty",
        "category_code": "I",
        "category_name": "INVESTMENT PLAN",
        "category_link": "LIFE",
        "multiple_detail": null,
        "renewable": null,
        "multiple_payment": "1",
        "product_icon": "fa-money",
        "policy_numbering": "SIP.{y}.|000000",
        "duration": 31,
        "comm_rate": "0",
        "policy_detail": null,
        "policy_code": null,
        "client_code": null,
        "agent_code": null,
        "guaranty_code": {
            "1": {
                "auto_id": "30",
                "guaranty_code": "C1700012",
                "guaranty_name": "SIMPLE LIFE AMOUNT",
                "guaranty_type": "MI",
                "guaranty_calc": "N1,000:1000|N2,000:2000|N5,000:5000|N10,000:10000",
                "guaranty_limit": "10000",
                "guaranty_option": "1",
                "description1": "Select monthly payment",
                "description2": "",
                "description3": "",
                "description4": "",
                "description5": null,
                "submit_by": null,
                "submit_on": null
            },
            "2": {
                "auto_id": "31",
                "guaranty_code": "C1700013",
                "guaranty_name": "85% INVESTMENT RETURN",
                "guaranty_type": "SF",
                "guaranty_calc": "0.85*{C1700012}",
                "guaranty_limit": "0",
                "guaranty_option": "1",
                "description1": "Investment return in monthly contribution",
                "description2": "",
                "description3": "",
                "description4": "",
                "description5": null,
                "submit_by": null,
                "submit_on": null
            },
            "3": {
                "auto_id": "32",
                "guaranty_code": "C1700014",
                "guaranty_name": "15% LIFE COVER",
                "guaranty_type": "SF",
                "guaranty_calc": "0.15*{C1700012}",
                "guaranty_limit": "0",
                "guaranty_option": "1",
                "description1": "10% of contributed value.",
                "description2": "",
                "description3": "",
                "description4": "",
                "description5": null,
                "submit_by": null,
                "submit_on": null
            }
        }
    }
}

```

**A Screen Shot**

![Insure_mobile_screenshot1](https://user-images.githubusercontent.com/1181072/58249136-f786a780-7d55-11e9-90d0-2341d3cfc97b.jpeg)



Getting Started
---------------
This project uses the Gradle build system. To build this project, use the
`gradlew build` command or use "Import Project" in Android Studio.

There are two Gradle tasks for testing the project:
* `connectedAndroidTest` - for running Espresso on a connected device
* `test` - for running unit tests

For more resources on learning Android development, visit the
[Developer Guides](https://developer.android.com/guide/) at
[developer.android.com](https://developer.android.com).



Libraries Used
--------------
* [Foundation][0] - Components for core system capabilities, Kotlin extensions and support for
  multidex and automated testing.
  * [AppCompat][1] - Degrade gracefully on older versions of Android.
  * [Android KTX][2] - Write more concise, idiomatic Kotlin code.
  * [Test][4] - An Android testing framework for unit and runtime UI tests.
* [Architecture][10] - A collection of libraries that help you design robust, testable, and
  maintainable apps. Start with classes for managing your UI component lifecycle and handling data
  persistence.
  * [Data Binding][11] - Declaratively bind observable data to UI elements.
  * [Lifecycles][12] - Create a UI that automatically responds to lifecycle events.
  * [LiveData][13] - Build data objects that notify views when the underlying database changes.
  * [Navigation][14] - Handle everything needed for in-app navigation.
  * [Room][16] - Access your app's SQLite database with in-app objects and compile-time checks.
  * [ViewModel][17] - Store UI-related data that isn't destroyed on app rotations. Easily schedule
     asynchronous tasks for optimal execution.
  * [WorkManager][18] - Manage your Android background jobs.
* [UI][30] - Details on why and how to use UI Components in your apps - together or separate
  * [Animations & Transitions][31] - Move widgets and transition between screens.
  * [Fragment][34] - A basic unit of composable UI.
  * [Layout][35] - Lay out widgets using different algorithms.
* Third party
  * [Glide][90] for image loading
  * [Kotlin Coroutines][91] for managing background threads with simplified code and reducing needs for callbacks
  * [Retrofit][90]  
  * [Dagger 2][90]   

[0]: https://developer.android.com/jetpack/foundation/
[1]: https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat
[2]: https://developer.android.com/kotlin/ktx
[4]: https://developer.android.com/training/testing/
[10]: https://developer.android.com/jetpack/arch/
[11]: https://developer.android.com/topic/libraries/data-binding/
[12]: https://developer.android.com/topic/libraries/architecture/lifecycle
[13]: https://developer.android.com/topic/libraries/architecture/livedata
[14]: https://developer.android.com/topic/libraries/architecture/navigation/
[16]: https://developer.android.com/topic/libraries/architecture/room
[17]: https://developer.android.com/topic/libraries/architecture/viewmodel
[18]: https://developer.android.com/topic/libraries/architecture/workmanager
[30]: https://developer.android.com/jetpack/ui/
[31]: https://developer.android.com/training/animation/
[34]: https://developer.android.com/guide/components/fragments
[35]: https://developer.android.com/guide/topics/ui/declaring-layout
[90]: https://bumptech.github.io/glide/
[91]: https://kotlinlang.org/docs/reference/coroutines-overview.html


Android Studio IDE setup instruction
------------------------
For development, the latest version of Android Studio 3.3 is required. The latest version can be
downloaded from [here](https://developer.android.com/studio/).

Sunflower uses [ktlint](https://ktlint.github.io/) to enforce Kotlin coding styles.
Here's how to configure it for use with Android Studio (instructions adapted
from the ktlint [README](https://github.com/shyiko/ktlint/blob/master/README.md)):

- Close Android Studio if it's open

- Download ktlint using these [installation instructions](https://github.com/shyiko/ktlint/blob/master/README.md#installation)

- Inside the project root directory run:

  `./ktlint --apply-to-idea-project --android`

- Start Android Studio

More Screen Shot
------------------------
![WhatsApp Image 2019-05-23 at 9 19 20 AM](https://user-images.githubusercontent.com/1181072/58249182-171dd000-7d56-11e9-9058-278920a3b436.jpeg)


![WhatsApp Image 2019-05-23 at 9 16 46 AM](https://user-images.githubusercontent.com/1181072/58249072-c8703600-7d55-11e9-907d-4e6a32e03c6f.jpeg)



