package br.sigede.utils.interceptors;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.sigede.controller.IndexController;
import br.sigede.utils.anotacoes.Public;
import br.sigede.utils.componentes.UserSession;


@Intercepts // declara classe do tipo interceptor
public class LoginInterceptor implements Interceptor {
	private Result result;
	private UserSession userSession;

	public LoginInterceptor(Result result, UserSession userSession) {
		this.result = result;
		this.userSession = userSession;
	}

	/**
	 * Decide se vai ou n�o interceptar a requisi��o atual.
	 *  
	 * @param method: representa qual � o m�todo java que ser� executado na requisi��o, o m�todo do  
	 *         			seu controller. Com esse objeto voc� tem acesso � classe do controller e ao  
	 *         			m�todo java dele (java.reflect.Method) para poder, por exemplo, ver qual �
	 *         			o nome do m�todo, ou se ele tem alguma anota��o
	 */
	public boolean accepts(ResourceMethod method) {
		//return !userSession.isLogged() ;
		/*
		return !(method.getMethod().isAnnotationPresent(Public.class) || 
				method.getResource().getType().isAnnotationPresent(Public.class));
		*/
		if (userSession.isLogged() && !(method.getMethod().isAnnotationPresent(Public.class))) {
			return true;
		}
		if (method.getResource().getType().isAnnotationPresent(Public.class)) {
			return true;
		}
		
		return false; 
					
		
	}

	/**
	 * Intercepta a requisi��o. 
	 * @param stack: possibilita continuar a execu��o normal da requisi��o e, portanto, executar de 
	 *					fato a l�gica de neg�cios. 
	 * @param method: representa qual � o m�todo java que ser� executado na requisi��o
	 * @param resourceInstance: � o controller instanciado.
	 */
	public void intercept(InterceptorStack stack, 
							ResourceMethod method, 
							Object resourceInstance)  throws InterceptionException {
		
		/*Nao interceptar quando se visulaiza um convite para participar do JATAI
		if(resourceInstance.getClass().getSimpleName().equals("ParticipanteController") 
				&& method.getMethod().getName().equals("visualizarConvite")){
			stack.next(method, resourceInstance);
		} else{
		*/
	
		if (userSession == null) {
			result.redirectTo(IndexController.class).home();
		} else {
			if (userSession.isLogged()) {
				stack.next(method, resourceInstance);
			} else {
				result.redirectTo(IndexController.class).home();
			}
		}
	
		//}
	}

}
