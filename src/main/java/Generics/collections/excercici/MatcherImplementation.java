/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.collections.excercici;

import java.util.List;

/**
 *
 * @author lubo1
 */
public class MatcherImplementation implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        Persona candidatoIdeal = new Persona();

        if (persona.getSexo() == Sexo.HOMBRE) {
            if (persona.getEdad() >= 16 && persona.getEdad() < 18) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() > 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 18 && persona.getEdad() < 25) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 25 && persona.getEdad() < 35) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 35 && persona.getEdad() < 45) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.MUJER
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            }

        } else {
            if (persona.getEdad() >= 16 && persona.getEdad() < 18) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() > 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 16 && candidatos.get(i).getEdad() < 18
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 18 && persona.getEdad() < 25) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 18 && candidatos.get(i).getEdad() < 25
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 25 && persona.getEdad() < 35) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 25 && candidatos.get(i).getEdad() < 35
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else if (persona.getEdad() >= 35 && persona.getEdad() < 45) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 35 && candidatos.get(i).getEdad() < 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            } else {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL) {

                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else if (persona.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.LESBIANA
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                } else {
                    if (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                                if (candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA
                                        || candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) {
                                    candidatoIdeal = candidatos.get(i);
                                }
                            }

                        }

                    } else {
                        for (int i = 0; i < candidatos.size(); i++) {
                            if (candidatos.get(i).getEdad() >= 45
                                    && candidatos.get(i).getSexo() == Sexo.HOMBRE
                                    && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO
                                    && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                                candidatoIdeal = candidatos.get(i);
                            }

                        }

                    }

                }

            }

        }

        return candidatoIdeal;
    }

}
