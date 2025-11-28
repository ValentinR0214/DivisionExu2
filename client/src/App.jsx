import { useState } from 'react'
import DivisionController from './modules/divisionController'

function App() {

  const [nums, setNums] = useState({
    num1: 0,
    num2: 0
  })

  const [resultado, setResultado] = useState("")

  const handleChange = ({ target }) => {
    const { name, value } = target

    setNums(previous => {
      return {
        ...previous,
        [name]: value
      }
    })
  }

  const doDividir = async () => {
    const resp = await DivisionController.doDivision(nums)
    setResultado(resp)
  }

  return (
    <>
      <nav className="navbar navbar-light bg-light">
        <span className="navbar-brand mb-0 h1">Ricardo Valentin Roque Hernandéz</span>
      </nav>


      <div className="container mt-4">
        <div className="col-4">
          <input onChange={(e) => handleChange(e)} name='num1' className='form-control' type="number" placeholder='Numero 1' />
        </div>
        <div className="col-4">
          <input onChange={(e) => handleChange(e)} name='num2' className='form-control' type="number" placeholder='Numero 2' />
        </div>
        <div className="col-4">
          <button onClick={() => doDividir()} className='btn btn-primary' >Dividir</button>
        </div>

        <br />
        <h3>Resultado {resultado}</h3>
      </div>
    </>
  )
}

export default App
