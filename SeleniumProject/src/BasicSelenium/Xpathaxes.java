package BasicSelenium;

public class Xpathaxes {//   filpkart->inspect men->ctrl+f to find x-path->these are the xpath
	// 1)parent & child
	// 2)preceding & following
	// 3)ancestors & decendents
	// 4)preceding sibling & following sibling
		//	Following==  //span[text()='Men']/following::li/a[text()='Top wear']/following::li/a[text()='Shirts']
		//	Preceding==  //a[text()='Shirts']/preceding::li/a[text()='Top wear']/preceding::span[text()='Men']
		//	parent and preceding-sibling==  //a[text()='Shirts']/parent::li/preceding-sibling::li/a[text()='Top wear']
       //	we can replace (parent::li) this with (..)
		//	ancestor==  //a[text()='Shirts']/ancestor::li/span[text()='Men']
}
