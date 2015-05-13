package aspect;

import metier.IChat;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyTester {
	
	public void testMethodEntry(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		IChat ichat = (IChat) proceedingJoinPoint.getTarget();	
		System.out.println("Chat [lstMessages=" + ichat.getLstMessages() + "]");
		if( (ichat.getLstMessages()).size()>10)
		{
			System.err.println("List de message > 10");
		}
		
	
		
	}
	
//	public void testMethodExit(StaticPart staticPart, Object result) {
//
//		// Nom de la méthode interceptée
//		String name = staticPart.getSignature().toLongString();
//
//		System.out.println(name + " returning: [" + result + "]");
//	}


}
