//import org.springframework.cloud.contract.spec.Contract
//
//[
//	Contract.make {
//		name("should create a customer")
//		description('''
//			given:
//				A request to create an user
//			when:
//				The user is stored in the database
//			then:
//				The created user is returned
//		''')
//
//		request {
//			method 'POST'
//			url '/customer'
//			body(
//					name : $(c(regex(nonBlank())), p('Antonio')),
//					email : $(c(regex(email())), p('antonio@gmail.com')),
//					age : $(c(regex(number())), p(42))
//			)
//			headers {
//				contentType(applicationJson())
//			}
//		}
//		response {
//			status 201
//			body (
//					name: $(p(fromRequest().body('name'))),
//					email: $(p(fromRequest().body('email'))),
//					age: $(p(fromRequest().body('age')))
//			)
//			headers {
//				contentType(applicationJson())
//			}
//		}
//	}
//]
//a