# Spring Task Scheduler

Here, we are going to see the details and application of below annotations
* @Scheduled
* @EnableScheduling
* @Async
* @EnableAsync

## @Scheduled
An annotation that marks a method to be scheduled. Exactly one of the below attributes must be specified.

		fixedDelay(),
		fixedRate(),
		initDelay(),
		cron(),
		fixedDelayString(),
		fixedRateString(),
		initDelayString()
		
Some condtions/rules for method that is annotated @Scheduled

* No arguments, otherwise system will throw an exception
* No return type, if not then return type will be ignored

Note: Processing of @Scheduled annotations is performed by registering a ScheduledAnnotationBeanPostProcessor. 

## @EnableScheduling
Enables Spring's scheduled task execution capability.
This enables detection of @Scheduled annotations on any Spring-managed bean in the container. 

## @EnableAsync
Enables Spring's asynchronous method execution capability.

## @Async
* Annotation that marks a method as a candidate for asynchronous execution. 
* Can also be used at the type level, in which case all of the type's methods are considered as asynchronous.
* In terms of target method signatures, any parameter types are supported. 
* However, the return type is constrained to either 
	* void or 
	* java.util.concurrent.Future. 
	
	
### Reference
* https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/EnableScheduling.html
* https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html
* https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/annotation/Async.html
* https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/annotation/EnableAsync.html