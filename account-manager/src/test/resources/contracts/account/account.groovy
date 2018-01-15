import org.springframework.cloud.contract.spec.Contract

[
	Contract.make {
		name("should create an account")
		description('''
			given:
				A new user that does not have an account
			when:
				The user requests the account creation
			then:
				The created account is returned
		''')

		request {
			method 'POST'
			url '/account'
			body(
					name : $(c(regex(nonBlank())), p('Jesus')),
					email : $(c(regex(email())), p('jesus@gmail.com')),
					age : $(c(regex(number())), p(36)),
					username: $(c(regex(nonBlank())), p('jesus36')),
					password: $(c(regex(nonBlank())), p('password'))
			)
			headers {
				contentType(applicationJson())
			}
		}
		response {
			status 201
			body (
					name: $(p(fromRequest().body('name'))),
					email: $(p(fromRequest().body('email'))),
					age: $(p(fromRequest().body('age'))),
					username: $(p(fromRequest().body('username')))
			)
			headers {
				contentType(applicationJson())
			}
		}
	}
]