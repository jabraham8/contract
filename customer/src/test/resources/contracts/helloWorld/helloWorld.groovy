import org.springframework.cloud.contract.spec.Contract

[
	Contract.make {
		name("should answer Hello to user")
		description('''
			given:
				An anonymous user is using the application
			when:
				The user request to be greeted
			then:
				The application greets the user
		''')

		request {
			method 'GET'
			url $(c('/test/hello/[a-zA-Z0-9]+'), p('/test/hello/Trump'))
		}
		response {
			status 200
			body (
				$(c("Hello " + fromRequest().path(2) + "!"), p("Hello Trump!"))	
			)
		}
	}
]
