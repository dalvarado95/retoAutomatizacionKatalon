package stepdefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.cucumber.datatable.DataTable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.After

import tasks.*
import questions.*
import utils.*

class AggProductoCarritoStepDefinition {

	@Given("el usuario ingresa a la website")
	def elUsuarioIngresaALaWebsite() {
		Navegar.aUrl()
	}

	@When("el agrega un producto con las siguientes caracteristicas (.*) (.*) (.*) (.*)")
	def elAgregaUnProductoConLasSiguientesCaracteristicas(String categoria, String subcategoria, String producto, String cantidad) {
		Leer.la(categoria,subcategoria,producto,cantidad)
		Seleccionar.unProducto()
		Agregar.aCarrito()
	}

	@Then("el verifica que el producto fue agregado correctamente con el mensaje (.*)")
	def elVerificaQueElProductoFueAgregadoCorrectamenteConElMensaje(String mensaje) {
		PodriaVerElProducto.esAgregado(mensaje)
	}
	
	@After
	def finalizado() {
		WebUI.closeBrowser()
	}
}