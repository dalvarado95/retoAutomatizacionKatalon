import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.linio.com.co/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PagePrincipal/btnCategorias'))

WebUI.mouseOver(findTestObject('PagePrincipal/lnkCategorias'))

WebUI.click(findTestObject('PagePrincipal/lnkSubcategorias'))

WebUI.setText(findTestObject('PageMonitores/txtBusqueda'), 'Monitor Samsung IPS de 22 Full HD Freesync 75Hz HDMI F22T350 - Negr')

WebUI.click(findTestObject('PageMonitores/btnBuscar'))

WebUI.click(findTestObject('PageProducto/lnkImagenProducto'))

WebUI.click(findTestObject('PageProducto/btnListadoCantidad'))

WebUI.click(findTestObject('PageProducto/btnCantidad'))

WebUI.click(findTestObject('PageProducto/btnAggCarrito'))

WebUI.verifyElementText(findTestObject('PageProducto/lblMensaje'), 'Tu producto se agregó al carrito')

WebUI.closeBrowser()

