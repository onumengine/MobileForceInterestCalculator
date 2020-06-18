# MobileForceInterestCalculator

The PiggyVest mobile application calculator is a handy tool that helps users calculate the interest they will receive after a certain period of time. 

#How it works?
The user user enters the amount that he wants and selects a plan that is 10% per annum on piggybank, up to 15.5% per annum on safeLock, 10% per annum on Target, 10% per annum on Flex, 6% per annum on Flex Dollar and up to 25% on Investify. 
The user then selects the duration and the frequency of saving which can be weekly, monthly. 
The application calculates and returnsthe result of the interest. 

Calculation:
The application uses a simple logic: 
	interest = (amount * rate * duration)/ 100 
	duration = ( freq* time)/12

Features: 
Ability to chose interest plans
User can choose their savings frequency(daily, monthly)

Technical specs
Platform: Android
Build: Java/Kotlin
